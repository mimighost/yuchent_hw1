package hw1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

import hw1.PosTagNamedEntityRecognizer;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

public class GeneTagAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas arg0) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		try {
			PosTagNamedEntityRecognizer tagger = new PosTagNamedEntityRecognizer();
			String docText = arg0.getDocumentText();
			String[] sentences = docText.split("\n");
			int doc_pos = 0;
			for (int i = 0; i < sentences.length; i++) {
				// System.out.println(i);
				Map<Integer, Integer> genes;
				int split = sentences[i].indexOf(" ");
				if (split == -1)
					continue;
				String linenum = sentences[i].substring(0, split);
				// System.out.println(content);
				String content = sentences[i].substring(split+1).replace(" ","");				
				genes = tagger.getGeneSpans(sentences[i]);
				Iterator iter = genes.entrySet().iterator();
				while (iter.hasNext()) {
					Map.Entry entry = (Map.Entry) iter.next();
					int begin = (Integer) entry.getKey();
					if (begin < 1) {
						continue;
					}
					int end = (Integer) entry.getValue();
					GeneTag gene = new GeneTag(arg0);
					System.out.println(doc_pos + begin);
					gene.setBegin(doc_pos + begin);
					gene.setEnd(doc_pos + end);
					
					String gene_text = sentences[i].substring(begin, end).replace(" ", "");
					int nbegin = content.indexOf(gene_text);
					gene.setNbegin(nbegin);
					gene.setNend(nbegin+gene_text.length()-1);
					gene.setLocation(linenum);
					gene.addToIndexes();
				}
				doc_pos += sentences[i].length() + 1;
			}
		} catch (ResourceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
