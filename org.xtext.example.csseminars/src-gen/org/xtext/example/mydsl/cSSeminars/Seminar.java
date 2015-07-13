/**
 */
package org.xtext.example.mydsl.cSSeminars;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seminar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Seminar#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Seminar#getOrganizers <em>Organizers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.Seminar#getTalks <em>Talks</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getSeminar()
 * @model
 * @generated
 */
public interface Seminar extends EObject
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
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getSeminar_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cSSeminars.Seminar#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Organizers</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cSSeminars.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organizers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organizers</em>' reference list.
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getSeminar_Organizers()
   * @model
   * @generated
   */
  EList<Member> getOrganizers();

  /**
   * Returns the value of the '<em><b>Talks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cSSeminars.Talk}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Talks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Talks</em>' containment reference list.
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getSeminar_Talks()
   * @model containment="true"
   * @generated
   */
  EList<Talk> getTalks();

} // Seminar
