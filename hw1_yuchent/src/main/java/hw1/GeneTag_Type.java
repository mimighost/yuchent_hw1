
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
 * Updated by JCasGen Wed Oct 17 10:43:56 EDT 2012
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
  final Feature casFeat_location;
  /** @generated */
  final int     casFeatCode_location;
  /** @generated */ 
  public String getLocation(int addr) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "hw1.GeneTag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_location);
  }
  /** @generated */    
  public void setLocation(int addr, String v) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "hw1.GeneTag");
    ll_cas.ll_setStringValue(addr, casFeatCode_location, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nbegin;
  /** @generated */
  final int     casFeatCode_nbegin;
  /** @generated */ 
  public int getNbegin(int addr) {
        if (featOkTst && casFeat_nbegin == null)
      jcas.throwFeatMissing("nbegin", "hw1.GeneTag");
    return ll_cas.ll_getIntValue(addr, casFeatCode_nbegin);
  }
  /** @generated */    
  public void setNbegin(int addr, int v) {
        if (featOkTst && casFeat_nbegin == null)
      jcas.throwFeatMissing("nbegin", "hw1.GeneTag");
    ll_cas.ll_setIntValue(addr, casFeatCode_nbegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nend;
  /** @generated */
  final int     casFeatCode_nend;
  /** @generated */ 
  public int getNend(int addr) {
        if (featOkTst && casFeat_nend == null)
      jcas.throwFeatMissing("nend", "hw1.GeneTag");
    return ll_cas.ll_getIntValue(addr, casFeatCode_nend);
  }
  /** @generated */    
  public void setNend(int addr, int v) {
        if (featOkTst && casFeat_nend == null)
      jcas.throwFeatMissing("nend", "hw1.GeneTag");
    ll_cas.ll_setIntValue(addr, casFeatCode_nend, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneTag_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_location = jcas.getRequiredFeatureDE(casType, "location", "uima.cas.String", featOkTst);
    casFeatCode_location  = (null == casFeat_location) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_location).getCode();

 
    casFeat_nbegin = jcas.getRequiredFeatureDE(casType, "nbegin", "uima.cas.Integer", featOkTst);
    casFeatCode_nbegin  = (null == casFeat_nbegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nbegin).getCode();

 
    casFeat_nend = jcas.getRequiredFeatureDE(casType, "nend", "uima.cas.Integer", featOkTst);
    casFeatCode_nend  = (null == casFeat_nend) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nend).getCode();

  }
}



    