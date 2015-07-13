/**
 */
package org.xtext.example.mydsl.cSSeminars.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage;
import org.xtext.example.mydsl.cSSeminars.DepartmentSeminars;
import org.xtext.example.mydsl.cSSeminars.Group;
import org.xtext.example.mydsl.cSSeminars.Member;
import org.xtext.example.mydsl.cSSeminars.Seminar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department Seminars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.DepartmentSeminarsImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.DepartmentSeminarsImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.DepartmentSeminarsImpl#getSeminars <em>Seminars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentSeminarsImpl extends MinimalEObjectImpl.Container implements DepartmentSeminars
{
  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<Group> groups;

  /**
   * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsers()
   * @generated
   * @ordered
   */
  protected EList<Member> users;

  /**
   * The cached value of the '{@link #getSeminars() <em>Seminars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeminars()
   * @generated
   * @ordered
   */
  protected EList<Seminar> seminars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepartmentSeminarsImpl()
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
    return CSSeminarsPackage.Literals.DEPARTMENT_SEMINARS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Group> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<Group>(Group.class, this, CSSeminarsPackage.DEPARTMENT_SEMINARS__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getUsers()
  {
    if (users == null)
    {
      users = new EObjectContainmentEList<Member>(Member.class, this, CSSeminarsPackage.DEPARTMENT_SEMINARS__USERS);
    }
    return users;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Seminar> getSeminars()
  {
    if (seminars == null)
    {
      seminars = new EObjectContainmentEList<Seminar>(Seminar.class, this, CSSeminarsPackage.DEPARTMENT_SEMINARS__SEMINARS);
    }
    return seminars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__USERS:
        return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__SEMINARS:
        return ((InternalEList<?>)getSeminars()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__GROUPS:
        return getGroups();
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__USERS:
        return getUsers();
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__SEMINARS:
        return getSeminars();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends Group>)newValue);
        return;
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__USERS:
        getUsers().clear();
        getUsers().addAll((Collection<? extends Member>)newValue);
        return;
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__SEMINARS:
        getSeminars().clear();
        getSeminars().addAll((Collection<? extends Seminar>)newValue);
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
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__GROUPS:
        getGroups().clear();
        return;
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__USERS:
        getUsers().clear();
        return;
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__SEMINARS:
        getSeminars().clear();
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
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__GROUPS:
        return groups != null && !groups.isEmpty();
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__USERS:
        return users != null && !users.isEmpty();
      case CSSeminarsPackage.DEPARTMENT_SEMINARS__SEMINARS:
        return seminars != null && !seminars.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DepartmentSeminarsImpl
