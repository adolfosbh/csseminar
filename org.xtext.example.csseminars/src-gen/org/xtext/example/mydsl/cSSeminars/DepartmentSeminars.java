/**
 */
package org.xtext.example.mydsl.cSSeminars;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department Seminars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getUsers <em>Users</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getSeminars <em>Seminars</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getDepartmentSeminars()
 * @model
 * @generated
 */
public interface DepartmentSeminars extends EObject
{
  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cSSeminars.Group}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getDepartmentSeminars_Groups()
   * @model containment="true"
   * @generated
   */
  EList<Group> getGroups();

  /**
   * Returns the value of the '<em><b>Users</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cSSeminars.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Users</em>' containment reference list.
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getDepartmentSeminars_Users()
   * @model containment="true"
   * @generated
   */
  EList<Member> getUsers();

  /**
   * Returns the value of the '<em><b>Seminars</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cSSeminars.Seminar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seminars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seminars</em>' containment reference list.
   * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage#getDepartmentSeminars_Seminars()
   * @model containment="true"
   * @generated
   */
  EList<Seminar> getSeminars();

} // DepartmentSeminars
