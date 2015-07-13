/**
 */
package org.xtext.example.mydsl.cSSeminars;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.cSSeminars.CSSeminarsFactory
 * @model kind="package"
 * @generated
 */
public interface CSSeminarsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cSSeminars";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/CSSeminars";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cSSeminars";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSSeminarsPackage eINSTANCE = org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.cSSeminars.impl.DepartmentSeminarsImpl <em>Department Seminars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.cSSeminars.impl.DepartmentSeminarsImpl
   * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getDepartmentSeminars()
   * @generated
   */
  int DEPARTMENT_SEMINARS = 0;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_SEMINARS__GROUPS = 0;

  /**
   * The feature id for the '<em><b>Users</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_SEMINARS__USERS = 1;

  /**
   * The feature id for the '<em><b>Seminars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_SEMINARS__SEMINARS = 2;

  /**
   * The number of structural features of the '<em>Department Seminars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPARTMENT_SEMINARS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.cSSeminars.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.cSSeminars.impl.GroupImpl
   * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.cSSeminars.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.cSSeminars.impl.MemberImpl
   * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Surname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__SURNAME = 1;

  /**
   * The feature id for the '<em><b>Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__GROUP = 2;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.cSSeminars.impl.SeminarImpl <em>Seminar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.cSSeminars.impl.SeminarImpl
   * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getSeminar()
   * @generated
   */
  int SEMINAR = 3;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMINAR__TITLE = 0;

  /**
   * The feature id for the '<em><b>Organizers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMINAR__ORGANIZERS = 1;

  /**
   * The feature id for the '<em><b>Talks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMINAR__TALKS = 2;

  /**
   * The number of structural features of the '<em>Seminar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMINAR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.cSSeminars.impl.TalkImpl <em>Talk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.cSSeminars.impl.TalkImpl
   * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getTalk()
   * @generated
   */
  int TALK = 4;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__TITLE = 0;

  /**
   * The feature id for the '<em><b>Presenters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__PRESENTERS = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK__DURATION = 2;

  /**
   * The number of structural features of the '<em>Talk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TALK_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.cSSeminars.DepartmentSeminars <em>Department Seminars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Department Seminars</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.DepartmentSeminars
   * @generated
   */
  EClass getDepartmentSeminars();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getGroups()
   * @see #getDepartmentSeminars()
   * @generated
   */
  EReference getDepartmentSeminars_Groups();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getUsers <em>Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Users</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getUsers()
   * @see #getDepartmentSeminars()
   * @generated
   */
  EReference getDepartmentSeminars_Users();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getSeminars <em>Seminars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Seminars</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.DepartmentSeminars#getSeminars()
   * @see #getDepartmentSeminars()
   * @generated
   */
  EReference getDepartmentSeminars_Seminars();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.cSSeminars.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.cSSeminars.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.cSSeminars.Group#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Group#getDescription()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.cSSeminars.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.cSSeminars.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.cSSeminars.Member#getSurname <em>Surname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Surname</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Member#getSurname()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Surname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.cSSeminars.Member#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Group</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Member#getGroup()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Group();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.cSSeminars.Seminar <em>Seminar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seminar</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Seminar
   * @generated
   */
  EClass getSeminar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.cSSeminars.Seminar#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Seminar#getTitle()
   * @see #getSeminar()
   * @generated
   */
  EAttribute getSeminar_Title();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.cSSeminars.Seminar#getOrganizers <em>Organizers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Organizers</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Seminar#getOrganizers()
   * @see #getSeminar()
   * @generated
   */
  EReference getSeminar_Organizers();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.cSSeminars.Seminar#getTalks <em>Talks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Talks</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Seminar#getTalks()
   * @see #getSeminar()
   * @generated
   */
  EReference getSeminar_Talks();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.cSSeminars.Talk <em>Talk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Talk</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Talk
   * @generated
   */
  EClass getTalk();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.cSSeminars.Talk#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Talk#getTitle()
   * @see #getTalk()
   * @generated
   */
  EAttribute getTalk_Title();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.cSSeminars.Talk#getPresenters <em>Presenters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Presenters</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Talk#getPresenters()
   * @see #getTalk()
   * @generated
   */
  EReference getTalk_Presenters();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.cSSeminars.Talk#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.xtext.example.mydsl.cSSeminars.Talk#getDuration()
   * @see #getTalk()
   * @generated
   */
  EAttribute getTalk_Duration();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CSSeminarsFactory getCSSeminarsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.cSSeminars.impl.DepartmentSeminarsImpl <em>Department Seminars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.cSSeminars.impl.DepartmentSeminarsImpl
     * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getDepartmentSeminars()
     * @generated
     */
    EClass DEPARTMENT_SEMINARS = eINSTANCE.getDepartmentSeminars();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT_SEMINARS__GROUPS = eINSTANCE.getDepartmentSeminars_Groups();

    /**
     * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT_SEMINARS__USERS = eINSTANCE.getDepartmentSeminars_Users();

    /**
     * The meta object literal for the '<em><b>Seminars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPARTMENT_SEMINARS__SEMINARS = eINSTANCE.getDepartmentSeminars_Seminars();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.cSSeminars.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.cSSeminars.impl.GroupImpl
     * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__DESCRIPTION = eINSTANCE.getGroup_Description();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.cSSeminars.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.cSSeminars.impl.MemberImpl
     * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__SURNAME = eINSTANCE.getMember_Surname();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__GROUP = eINSTANCE.getMember_Group();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.cSSeminars.impl.SeminarImpl <em>Seminar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.cSSeminars.impl.SeminarImpl
     * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getSeminar()
     * @generated
     */
    EClass SEMINAR = eINSTANCE.getSeminar();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEMINAR__TITLE = eINSTANCE.getSeminar_Title();

    /**
     * The meta object literal for the '<em><b>Organizers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMINAR__ORGANIZERS = eINSTANCE.getSeminar_Organizers();

    /**
     * The meta object literal for the '<em><b>Talks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMINAR__TALKS = eINSTANCE.getSeminar_Talks();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.cSSeminars.impl.TalkImpl <em>Talk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.cSSeminars.impl.TalkImpl
     * @see org.xtext.example.mydsl.cSSeminars.impl.CSSeminarsPackageImpl#getTalk()
     * @generated
     */
    EClass TALK = eINSTANCE.getTalk();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TALK__TITLE = eINSTANCE.getTalk_Title();

    /**
     * The meta object literal for the '<em><b>Presenters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TALK__PRESENTERS = eINSTANCE.getTalk_Presenters();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TALK__DURATION = eINSTANCE.getTalk_Duration();

  }

} //CSSeminarsPackage
