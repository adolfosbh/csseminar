/**
 */
package org.xtext.example.mydsl.cSSeminars;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Talk#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Talk#getPresenters <em>Presenters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Talk#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getTalk()
 * @model
 * @generated
 */
public interface Talk extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getTalk_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cSSeminars.Talk#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Presenters</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cSSeminars.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presenters</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presenters</em>' reference list.
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getTalk_Presenters()
   * @model
   * @generated
   */
  EList<Member> getPresenters();

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(String)
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getTalk_Duration()
   * @model
   * @generated
   */
  String getDuration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cSSeminars.Talk#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(String value);

} // Talk
