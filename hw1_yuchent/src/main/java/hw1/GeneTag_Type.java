
/* First created by JCasGen Sun Oct 14 18:24:46 EDT 2012 */
package hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The class to hold the tag result

 * Updated by JCasGen Sun Oct 14 18:24:46 EDT 2012
 * @generated */
public class GeneTag_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneTag_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneTag_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneTag(addr, GeneTag_Type.this);
  			   GeneTag_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneTag(addr, GeneTag_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneTag.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.GeneTag");
 
  /** @generated */
  final Feature casFeat_gene;
  /** @generated */
  final int     casFeatCode_gene;
  /** @generated */ 
  public String getGene(int addr) {
        if (featOkTst && casFeat_gene == null)
      jcas.throwFeatMissing("gene", "hw1.GeneTag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gene);
  }
  /** @generated */    
  public void setGene(int addr, String v) {
        if (featOkTst && casFeat_gene == null)
      jcas.throwFeatMissing("gene", "hw1.GeneTag");
    ll_cas.ll_setStringValue(addr, casFeatCode_gene, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneTag_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_gene = jcas.getRequiredFeatureDE(casType, "gene", "uima.cas.String", featOkTst);
    casFeatCode_gene  = (null == casFeat_gene) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gene).getCode();

  }
}



    