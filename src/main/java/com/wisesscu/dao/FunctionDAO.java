package com.wisesscu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisesscu.pojo.Function;

/**
 * function DAO
 *    
 * ��Ŀ���ƣ�base_spring_framework   
 * �����ƣ�FunctionDAO   
 * ��������   
 * �����ˣ�huangx   
 * ����ʱ�䣺2015��1��27�� ����7:09:58   
 * �޸��ˣ�huangx   
 * �޸�ʱ�䣺2015��1��27�� ����7:09:58   
 * �޸ı�ע��   
 * @version    
 *
 */
public interface FunctionDAO {

 
   /*###############-------insert����-------##################*/
   /**
    * 
   * @Title: insertFunction
   * @Description: ��������
   * @param @param function
   * @return 
   * @throws
    */
   public void insertFunction(Function function);
    
   /**
    * 
   * @Title: insertFunctionRole
   * @Description: �����û�����ɫ����
   * @param @param functionId ����ID
   * @param @param roleId ��ɫID
   * @return void    ��������
   * @throws
    */
   public void insertFunctionRole(@Param("functionId") int functionId,@Param("roleId") int roleId);
   
   /**
    * 
   * @Title: deleteFunction
   * @Description: ɾ�����ܱ�
   * @param @param id    id
   * @return void    ��������
   * @throws
    */
   /*###############-------insert����-------##################*/
   
   
   
   
   
   
 /*###############-------delete����-------##################*/
   public void deleteFunction(int id);
   
   /**
    * 
   * @Title: deleteFunctionRole
   * @Description: ɾ��������
   * @param @param functionId   ����ID
   * @return void    ��������
   * @throws
    */
   public void deleteFunctionRole(int functionId);
   
   /**
    * 
   * @Title: deleteFunctionRole
   * @Description: ɾ��������
   * @param: roleId    ��ɫid
   * @return void    ��������
   * @throws
    */
   public void deleteRoleFunction(int roleId);
   
 /*###############-------delete����-------##################*/
   
   
   
  /*###############-------update����-------##################*/
   /**
    * �޸�function״̬
   * @Title: updateState
   * @Description: �޸�function״̬
   * @param @param id functionId
   * @param @param state ״̬
   * @return void    ��������
   * @throws
    */
   public void updateState(@Param("id")int id, @Param("state")int state);
   
   
   /**
    * �޸�function
   * @Title: updateFunction
   * @Description: �޸�
   * @param @param function
   * @return void    ��������
   * @throws
    */
   public void updateFunction(Function function);
   
  /*###############-------update����-------##################*/
   
   
   
   
   
 /*###############-------find����-------##################*/
   
   /**
    * ����function
   * @Title: findFunction
   * @Description: ����function
   * @param @param id
   * @param @return
   * @return Function    ��������
   * @throws
    */
   public Function findFunction(int id);
   
   /**
   * @Title: findAllEffectiveFunctionsbyRoleId
   * @Description: ����roleId��ѯ��Ч��functions
   * @param @param roleId
   * @param @return �趨�ļ�
   * @return List<Function> ��������
   * @throws
   */
   public List<Function> findAllEffectiveFunctionsbyRoleId(Integer roleId);
    
   /**
    * 
    * @Title: findEffectiveFunctinList
    * @Description: ��ѯ������Ч�Ĺ���Ȩ���б�
    * @return List<Function> ��Ч�Ĺ���Ȩ���б����б�
    * @throws
    */
   public List<Function> findEffectiveFunctinList();

   
   /**
    * 
   * @Title: findAllEffectiveFunctionsbyLoginName
   * @Description: ��ѯ��ǰ�û���Ȩ��
   * @param @param loginName ��½��
   * @param @return    �趨�ļ�
   * @return List<Function>    ��������
   * @throws
    */
   public List<Function> findAllEffectiveFunctionsbyLoginName(String loginName);
   
   /**
    * 
   * @Title: findFunctionList
   * @Description: ��ѯ���й���ģ��
   * @param @return    �趨�ļ�
   * @return List<Function>    �����б�
   * @throws
    */
   public List<Function> findFunctionList();
   
   
   /**
    * 
   * @Title: findEffectiveFunctionsbyAction
   * @Description: ��ѯfunctionId
   * @param @param action action����
   * @param @return    �趨�ļ�
   * @return List<Integer>    ��������
   * @throws
    */
   public List<Integer> findEffectiveFunctionsbyAction(String action);



   /**
    * 
   * @Title: findFunctionListByfNameAndAction
   * @Description: ������ѯfunction list
   * @param @param function
   * @param @return    �趨�ļ�
   * @return List<Function>    ��������
   * @throws
    */
   public List<Function> findFunctionListByQuery(Function function);

   /**
    * 
   * @Title: findFunctionTee
   * @Description: ��ѯ��ɫ�¶�Ӧ�Ĺ���
   * @param��roleId
   * @return List<FunctionTree>     ��������
   * @throws
    */  
   public List<Integer> findFunctionTree(int roleId);
   

   /**
    * 
   * @Title: findFunctionbyParentId
   * @Description: ��ѯ���ӽڵ�
   * @param @param id
   * @param @return    �趨�ļ�
   * @return List<Function>    ��������
   * @throws
    */
   public List<Function> findFunctionbyParentId(int id);
   

   /**
    * 
   * @Title: findFunctionbyParentIdAndFunctionName
   * @Description: ����functionName��parentId��ѯ�б�
   * @param @param function
   * @param @return
   * @return List<Function>    ��������
   * @throws
    */
   public List<Function> findFunctionbyParentIdAndFunctionName(Function function);
   
   /*###############-------find����-------##################*/

}