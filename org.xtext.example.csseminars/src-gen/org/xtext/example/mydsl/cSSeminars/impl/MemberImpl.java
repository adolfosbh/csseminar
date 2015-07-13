/**
 */
package org.xtext.example.mydsl.cSSeminars.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage;
import org.xtext.example.mydsl.cSSeminars.Group;
import org.xtext.example.mydsl.cSSeminars.Member;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.MemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.MemberImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.MemberImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberImpl extends MinimalEObjectImpl.Container implements Member
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurname()
   * @generated
   * @ordered
   */
  protected static final String SURNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurname()
   * @generated
   * @ordered
   */
  protected String surname = SURNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected Group group;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemberImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CSSeminarsPackage.Literals.MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSeminarsPackage.MEMBER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSurname()
  {
    return surname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSurname(String newSurname)
  {
    String oldSurname = surname;
    surname = newSurname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSeminarsPackage.MEMBER__SURNAME, oldSurname, surname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group getGroup()
  {
    if (group != null && group.eIsProxy())
    {
      InternalEObject oldGroup = (InternalEObject)group;
      group = (Group)eResolveProxy(oldGroup);
      if (group != oldGroup)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSSeminarsPackage.MEMBER__GROUP, oldGroup, group));
      }
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group basicGetGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(Group newGroup)
  {
    Group oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSeminarsPackage.MEMBER__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CSSeminarsPackage.MEMBER__NAME:
        return getName();
      case CSSeminarsPackage.MEMBER__SURNAME:
        return getSurname();
      case CSSeminarsPackage.MEMBER__GROUP:
        if (resolve) return getGroup();
        return basicGetGroup();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CSSeminarsPackage.MEMBER__NAME:
        setName((String)newValue);
        return;
      case CSSeminarsPackage.MEMBER__SURNAME:
        setSurname((String)newValue);
        return;
      case CSSeminarsPackage.MEMBER__GROUP:
        setGroup((Group)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CSSeminarsPackage.MEMBER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CSSeminarsPackage.MEMBER__SURNAME:
        setSurname(SURNAME_EDEFAULT);
        return;
      case CSSeminarsPackage.MEMBER__GROUP:
        setGroup((Group)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CSSeminarsPackage.MEMBER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CSSeminarsPackage.MEMBER__SURNAME:
        return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
      case CSSeminarsPackage.MEMBER__GROUP:
        return group != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", surname: ");
    result.append(surname);
    result.append(')');
    return result.toString();
  }

} //MemberImpl
