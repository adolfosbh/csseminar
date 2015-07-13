/**
 */
package org.xtext.example.mydsl.cSSeminars.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.cSSeminars.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSSeminarsFactoryImpl extends EFactoryImpl implements CSSeminarsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CSSeminarsFactory init()
  {
    try
    {
      CSSeminarsFactory theCSSeminarsFactory = (CSSeminarsFactory)EPackage.Registry.INSTANCE.getEFactory(CSSeminarsPackage.eNS_URI);
      if (theCSSeminarsFactory != null)
      {
        return theCSSeminarsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CSSeminarsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSeminarsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CSSeminarsPackage.DEPARTMENT_SEMINARS: return createDepartmentSeminars();
      case CSSeminarsPackage.GROUP: return createGroup();
      case CSSeminarsPackage.MEMBER: return createMember();
      case CSSeminarsPackage.SEMINAR: return createSeminar();
      case CSSeminarsPackage.TALK: return createTalk();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepartmentSeminars createDepartmentSeminars()
  {
    DepartmentSeminarsImpl departmentSeminars = new DepartmentSeminarsImpl();
    return departmentSeminars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Seminar createSeminar()
  {
    SeminarImpl seminar = new SeminarImpl();
    return seminar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Talk createTalk()
  {
    TalkImpl talk = new TalkImpl();
    return talk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSeminarsPackage getCSSeminarsPackage()
  {
    return (CSSeminarsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CSSeminarsPackage getPackage()
  {
    return CSSeminarsPackage.eINSTANCE;
  }

} //CSSeminarsFactoryImpl
