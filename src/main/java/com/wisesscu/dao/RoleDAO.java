package com.wisesscu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wisesscu.pojo.Role;


/**
 * role DAO
 * 
 * ��Ŀ���ƣ�base_spring_framework �����ƣ�RoleDAO �������� �����ˣ�huangx ����ʱ�䣺2015��1��27�� ����7:09:58 �޸��ˣ�huangx
 * �޸�ʱ�䣺2015��1��27�� ����7:09:58 �޸ı�ע��
 * 
 * @version
 * 
 */
public interface RoleDAO {

  /**
   * 
   * @Title: insertRole
   * @Description: ������ɫ
   * @param: role
   * @return
   * @throws
   */
  public void insertRole(Role role);


  /**
   * 
   * @Title: updateRole
   * @Description: �޸Ľ�ɫ
   * @param: role
   * @return
   * @throws
   */
  public void updateRole(Role role);

  /**
   * 
   * @Title: updateRoleState
   * @Description: ���½�ɫ״̬
   * @param: tempMap [id:roleId,state:��ɫ״̬]
   * @return
   * @throws
   */
  public void updateRoleState(Map<String, Object> tempMap);

  /**
   * 
   * @Title: deleteRole
   * @Description: ɾ����ɫ
   * @param: roleId ��ɫid
   * @return: void ��������
   * @throws
   */
  public void deleteRole(Integer roleId);

  /**
   * 
   * @Title: deleteFunctionRole
   * @Description: ɾ����ɫ���ܹ�����
   * @param: roleId ��ɫid
   * @return: void ��������
   * @throws
   */
  public void deleteFunctionRole(Integer roleId);

  /**
   * 
   * @Title: findAllEffectiveRole
   * @Description: ��ѯ������Ч�Ľ�ɫ
   * @param: �趨�ļ�
   * @return: List<Role> ��������
   * @throws
   */
  public List<Role> findAllEffectiveRoles();

  /**
   * 
   * @Title: findRolesByLoginName
   * @Description: ���ݵ�½����ѯ��ɫ
   * @param: loginName
   * @return: List<Role> ��������
   * @throws
   */
  public List<Role> findRolesByLoginName(String loginName);


  /**
   * 
   * @Title: findRolesByFunctIonId
   * @Description: ����functionId��ѯroleId
   * @param: functionId ����ID
   * @return: List<Integer> ��������
   * @throws
   */
  public List<Integer> findRolesByFunctIonId(Integer functionId);

  /**
   * 
   * @Title: findRoleList
   * @Description: ��ѯ���н�ɫ
   * @param: tempMap [roleName:��ɫ����]
   * @return: List<Role> ��������
   * @throws
   */
  public List<Role> findRoleList(Map<String, Object> tempMap);


  /**
   * 
   * @Title: findRoleById
   * @Description: ����roleId��ѯ��ɫ��Ϣ
   * @param: roleId ��ɫid
   * @return: Role ��������
   * @throws
   */
  public Role findRoleById(Integer roleId);


  /**
   * 
  * @Title: findRoleByRoleName
  * @Description: ����roleName��ѯ��ɫ��Ϣ
  * @param @param roleName
  * @param @return
  * @return List<Role>    ��������
  * @throws
   */

  public List<Role> findRoleByRoleName(String roleName);
  /**
   * ���ݽ�ɫɾ������
   * @param roleId
   */
  public void deleteRoleFunction(@Param("roleId")int roleId);
  /**
   * �����ɫ���ܱ�
   * @param roleId
   * @param functionId
   */
  public void insertRoleFunction(@Param("roleId")int roleId,@Param("functionId")int functionId);
}
