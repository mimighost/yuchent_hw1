

/* First created by JCasGen Sun Oct 14 18:24:46 EDT 2012 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The class to hold the tag result
 * Updated by JCasGen Mon Oct 15 01:12:37 EDT 2012
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
  //* Feature: location

  /** getter for location - gets Line number of this gene
   * @generated */
  public String getLocation() {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "hw1.GeneTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTag_Type)jcasType).casFeatCode_location);}
    
  /** setter for location - sets Line number of this gene 
   * @generated */
  public void setLocation(String v) {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "hw1.GeneTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTag_Type)jcasType).casFeatCode_location, v);}    
   
    
  //*--------------*
  //* Feature: nbegin

  /** getter for nbegin - gets begin index in a line
   * @generated */
  public int getNbegin() {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_nbegin == null)
      jcasType.jcas.throwFeatMissing("nbegin", "hw1.GeneTag");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneTag_Type)jcasType).casFeatCode_nbegin);}
    
  /** setter for nbegin - sets begin index in a line 
   * @generated */
  public void setNbegin(int v) {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_nbegin == null)
      jcasType.jcas.throwFeatMissing("nbegin", "hw1.GeneTag");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneTag_Type)jcasType).casFeatCode_nbegin, v);}    
   
    
  //*--------------*
  //* Feature: nend

  /** getter for nend - gets end index of line
   * @generated */
  public int getNend() {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_nend == null)
      jcasType.jcas.throwFeatMissing("nend", "hw1.GeneTag");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneTag_Type)jcasType).casFeatCode_nend);}
    
  /** setter for nend - sets end index of line 
   * @generated */
  public void setNend(int v) {
    if (GeneTag_Type.featOkTst && ((GeneTag_Type)jcasType).casFeat_nend == null)
      jcasType.jcas.throwFeatMissing("nend", "hw1.GeneTag");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneTag_Type)jcasType).casFeatCode_nend, v);}    
  }

    