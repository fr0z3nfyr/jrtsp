/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package jy.jrtsp.common;

import jy.jrtsp.action.RtspAction;
import jy.jrtsp.protocol.RtspMessage;

public interface RtspSession {

	/**
	 * ����RTSP��Ϣ
	 * @param message RTSP��Ϣ
	 */
	public void write(RtspMessage message);
	
	/**
	 * ����RTSP��Ϣ�������RtspAction
	 * @param message
	 * @param action
	 */
	public void write(RtspMessage message, RtspAction action);
		
	/**
	 * �ر�RTSP����
	 */
	public void close();
	
	/**
	 * Ϊ��ǰSession����һ��˽�е�����
	 * @param key
	 * @param value
	 */
	public void setAttribute(String key, Object value);
	
	/**
	 * ��ȡ��ǰSession��һ������
	 * @param key
	 * @return
	 */
	public Object getAttribute(String key);
	
	/**
	 * ɾ����ǰSession��һ������
	 * @param key
	 */
	public void removeAttribute(String key);
	
	/**
	 * ��յ�ǰSession����������
	 */
	public void clearAttributes();

	/**
	 * ��ǰSession�Ƿ�������
	 * @return
	 */
	public boolean isConnected();
	
	/**
	 * ����Session�Ŀ������ڣ��Ժ���Ϊ��λ��
	 * �����е�ʱ���ﵽ�趨������ʱ����������RtspEventListener.sessionIdle(RtspSession session)
	 * @param timeout
	 */
	public void setIdleTimeout(int timeout);
	
	/**
	 * ��ȡ��ǰSession��RtspActionHandler;
	 * @return
	 */
	public RtspActionHandler getActionHandler();
}
