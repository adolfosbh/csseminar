/**
 */
package org.xtext.example.mydsl.cSSeminars;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Member#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Member#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Member#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getMember_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cSSeminars.Member#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Surname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Surname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Surname</em>' attribute.
   * @see #setSurname(String)
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getMember_Surname()
   * @model
   * @generated
   */
  String getSurname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cSSeminars.Member#getSurname <em>Surname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Surname</em>' attribute.
   * @see #getSurname()
   * @generated
   */
  void setSurname(String value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' reference.
   * @see #setGroup(Group)
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getMember_Group()
   * @model
   * @generated
   */
  Group getGroup();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cSSeminars.Member#getGroup <em>Group</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' reference.
   * @see #getGroup()
   * @generated
   */
  void setGroup(Group value);

} // Member
