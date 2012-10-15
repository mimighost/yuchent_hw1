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
			for(int i=0;i<100;i++){
			System.out.println(i);
			Map<Integer,Integer> genes;
			genes = tagger.getGeneSpans(sentences[i]);
			Iterator iter = genes.entrySet().iterator();
			while(iter.hasNext()){
				Map.Entry entry = (Map.Entry) iter.next();
				int begin = (Integer) entry.getKey();
				int end = (Integer) entry.getKey();
				GeneTag gene = new GeneTag(arg0);
				gene.setBegin(begin);
				gene.setEnd(end);
				gene.setGene("gene");
				gene.addToIndexes();
				
			}
			}
		} catch (ResourceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
