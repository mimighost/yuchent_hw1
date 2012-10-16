package hw1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

import hw1.PosTagNamedEntityRecognizer;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceAccessException;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

public class GeneTagAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas arg0) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		try {
			PosTagNamedEntityRecognizer tagger = new PosTagNamedEntityRecognizer();
			File modelFile = new File("src/main/java/hw1/HmmChunker");
			Chunker chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
			String docText = arg0.getDocumentText();
			String[] sentences = docText.split("\n");
			int doc_pos = 0;
			for (int i = 0; i < sentences.length; i++) {
				// System.out.println(i);
				//Map<Integer, Integer> genes;
				Chunking chunking = chunker.chunk(sentences[i]);
				//System.out.println(chunking);
				Set<Chunk> Genes = chunking.chunkSet();
				Iterator ig = Genes.iterator();
				
				int split = sentences[i].indexOf(" ");
				if (split == -1)
					continue;
				String linenum = sentences[i].substring(0, split);
				//System.out.println(Genes);
				String content = sentences[i].substring(split + 1).replace(" ","");
				while (ig.hasNext()) {
					//Map.Entry entry = (Map.Entry) iter.next();
					Chunk chnk = (Chunk) ig.next();
					
					int begin = chnk.start();
					if (begin < 1) {
						continue;
					}
					int end = chnk.end();
					GeneTag gene = new GeneTag(arg0);
					System.out.println(doc_pos + begin);
					gene.setBegin(doc_pos + begin);
					gene.setEnd(doc_pos + end);

					String gene_text = sentences[i].substring(begin, end).replace(" ", "");
					int nbegin = content.indexOf(gene_text);
					gene.setNbegin(nbegin);
					gene.setNend(nbegin + gene_text.length() - 1);
					gene.setLocation(linenum);
					gene.addToIndexes();
				}
				doc_pos += sentences[i].length() + 1;
			}
		} catch (ResourceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}