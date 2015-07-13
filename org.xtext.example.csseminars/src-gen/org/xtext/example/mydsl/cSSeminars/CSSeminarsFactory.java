/**
 */
package org.xtext.example.mydsl.cSSeminars;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage
 * @generated
 */
public interface CSSeminarsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSSeminarsFactory eINSTANCE = org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Department Seminars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Department Seminars</em>'.
   * @generated
   */
  DepartmentSeminars createDepartmentSeminars();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Seminar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seminar</em>'.
   * @generated
   */
  Seminar createSeminar();

  /**
   * Returns a new object of class '<em>Talk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Talk</em>'.
   * @generated
   */
  Talk createTalk();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CSSeminarsPackage getCSSeminarsPackage();

} //CSSeminarsFactory
