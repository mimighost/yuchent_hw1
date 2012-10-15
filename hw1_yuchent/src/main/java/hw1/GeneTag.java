

/* First created by JCasGen Sun Oct 14 18:24:46 EDT 2012 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The class to hold the tag result

 * Updated by JCasGen Sun Oct 14 18:24:46 EDT 2012
 * XML source: /Users/mimighostipad/git/yuchent_hw1/hw1_yuchent/src/main/resources/descriptors/typeSystemDescriptorHW1.xml
 * @generated */
public class GeneTag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneTag.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneTag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneTag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneTag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneTag(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: gene

  /** getter for gene - gets The name of the gene
   * @generated */
  public String getGene() {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_gene == null)
      jcasType.jcas.throwFeatMissing("gene", "hw1.GeneTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTag_Type)jcasType).casFeatCode_gene);}
    
  /** setter for gene - sets The name of the gene 
   * @generated */
  public void setGene(String v) {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_gene == null)
      jcasType.jcas.throwFeatMissing("gene", "hw1.GeneTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTag_Type)jcasType).casFeatCode_gene, v);}    
  }

    