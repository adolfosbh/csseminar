/**
 */
package org.xtext.example.mydsl.cSSeminars.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.cSSeminars.CSSeminarsPackage;
import org.xtext.example.mydsl.cSSeminars.Member;
import org.xtext.example.mydsl.cSSeminars.Seminar;
import org.xtext.example.mydsl.cSSeminars.Talk;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seminar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.SeminarImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.SeminarImpl#getOrganizers <em>Organizers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cSSeminars.impl.SeminarImpl#getTalks <em>Talks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeminarImpl extends MinimalEObjectImpl.Container implements Seminar
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrganizers() <em>Organizers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizers()
   * @generated
   * @ordered
   */
  protected EList<Member> organizers;

  /**
   * The cached value of the '{@link #getTalks() <em>Talks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTalks()
   * @generated
   * @ordered
   */
  protected EList<Talk> talks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeminarImpl()
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
    return CSSeminarsPackage.Literals.SEMINAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSeminarsPackage.SEMINAR__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getOrganizers()
  {
    if (organizers == null)
    {
      organizers = new EObjectResolvingEList<Member>(Member.class, this, CSSeminarsPackage.SEMINAR__ORGANIZERS);
    }
    return organizers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Talk> getTalks()
  {
    if (talks == null)
    {
      talks = new EObjectContainmentEList<Talk>(Talk.class, this, CSSeminarsPackage.SEMINAR__TALKS);
    }
    return talks;
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
      case CSSeminarsPackage.SEMINAR__TALKS:
        return ((InternalEList<?>)getTalks()).basicRemove(otherEnd, msgs);
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
      case CSSeminarsPackage.SEMINAR__TITLE:
        return getTitle();
      case CSSeminarsPackage.SEMINAR__ORGANIZERS:
        return getOrganizers();
      case CSSeminarsPackage.SEMINAR__TALKS:
        return getTalks();
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
      case CSSeminarsPackage.SEMINAR__TITLE:
        setTitle((String)newValue);
        return;
      case CSSeminarsPackage.SEMINAR__ORGANIZERS:
        getOrganizers().clear();
        getOrganizers().addAll((Collection<? extends Member>)newValue);
        return;
      case CSSeminarsPackage.SEMINAR__TALKS:
        getTalks().clear();
        getTalks().addAll((Collection<? extends Talk>)newValue);
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
      case CSSeminarsPackage.SEMINAR__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case CSSeminarsPackage.SEMINAR__ORGANIZERS:
        getOrganizers().clear();
        return;
      case CSSeminarsPackage.SEMINAR__TALKS:
        getTalks().clear();
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
      case CSSeminarsPackage.SEMINAR__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case CSSeminarsPackage.SEMINAR__ORGANIZERS:
        return organizers != null && !organizers.isEmpty();
      case CSSeminarsPackage.SEMINAR__TALKS:
        return talks != null && !talks.isEmpty();
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
    result.append(" (title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //SeminarImpl
