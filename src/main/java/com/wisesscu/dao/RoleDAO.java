package com.wisesscu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wisesscu.pojo.Role;


/**
 * role DAO
 * 
 * 项目名称：base_spring_framework 类名称：RoleDAO 类描述： 创建人：huangx 创建时间�?2015�?1�?27�? 下午7:09:58 修改人：huangx
 * 修改时间�?2015�?1�?27�? 下午7:09:58 修改备注�?
 * 
 * @version
 * 
 */
public interface RoleDAO {

  /**
   * 
   * @Title: insertRole
   * @Description: 新增角色
   * @param: role
   * @return
   * @throws
   */
  public void insertRole(Role role);


  /**
   * 
   * @Title: updateRole
   * @Description: 修改角色
   * @param: role
   * @return
   * @throws
   */
  public void updateRole(Role role);

  /**
   * 
   * @Title: updateRoleState
   * @Description: 更新角色状�??
   * @param: tempMap [id:roleId,state:角色状�?�]
   * @return
   * @throws
   */
  public void updateRoleState(Map<String, Object> tempMap);

  /**
   * 
   * @Title: deleteRole
   * @Description: 删除角色
   * @param: roleId 角色id
   * @return: void 返回类型
   * @throws
   */
  public void deleteRole(Integer roleId);

  /**
   * 
   * @Title: deleteFunctionRole
   * @Description: 删除角色功能关联�?
   * @param: roleId 角色id
   * @return: void 返回类型
   * @throws
   */
  public void deleteFunctionRole(Integer roleId);

  /**
   * 
   * @Title: findAllEffectiveRole
   * @Description: 查询�?有有效的角色
   * @param: 设定文件
   * @return: List<Role> 返回类型
   * @throws
   */
  public List<Role> findAllEffectiveRoles();

  /**
   * 
   * @Title: findRolesByLoginName
   * @Description: 根据登陆名查询角�?
   * @param: loginName
   * @return: List<Role> 返回类型
   * @throws
   */
  public List<Role> findRolesByLoginName(String loginName);


  /**
   * 
   * @Title: findRolesByFunctIonId
   * @Description: 根据functionId查询roleId
   * @param: functionId 功能ID
   * @return: List<Integer> 返回类型
   * @throws
   */
  public List<Integer> findRolesByFunctIonId(Integer functionId);

  /**
   * 
   * @Title: findRoleList
   * @Description: 查询�?有角�?
   * @param: tempMap [roleName:角色名称]
   * @return: List<Role> 返回类型
   * @throws
   */
  public List<Role> findRoleList(Map<String, Object> tempMap);


  /**
   * 
   * @Title: findRoleById
   * @Description: 根据roleId查询角色信息
   * @param: roleId 角色id
   * @return: Role 返回类型
   * @throws
   */
  public Role findRoleById(Integer roleId);


  /**
   * 
  * @Title: findRoleByRoleName
  * @Description: 根据roleName查询角色信息
  * @param @param roleName
  * @param @return
  * @return List<Role>    返回类型
  * @throws
   */

  public List<Role> findRoleByRoleName(String roleName);
  /**
   * 根据角色删除功能
   * @param roleId
   */
  public void deleteRoleFunction(@Param("roleId")int roleId);
  /**
   * 插入角色功能�?
   * @param roleId
   * @param functionId
   */
  public void insertRoleFunction(@Param("roleId")int roleId,@Param("functionId")int functionId);
}
