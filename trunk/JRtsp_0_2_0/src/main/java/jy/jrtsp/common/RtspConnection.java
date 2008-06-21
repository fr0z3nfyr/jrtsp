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

import java.net.SocketAddress;

public interface RtspConnection {

	/**
	 * ����RTSP������
	 * @param address ��������ַ
	 */
	public void connect(SocketAddress address);
	
	/**
	 * ����RTSP������,���ӳɹ������listener.operationCompleted();
	 * @param address 
	 * @param listener 
	 */
	public void connect(final SocketAddress address, final ConnectListener listener);
	
	/**
	 * ����RTSP������, ʹ��ָ����<code>handler</code>
	 * @param address
	 * @param handler
	 */
	public void connect(final SocketAddress address, final RtspActionHandler handler);
	
	/**
	 * ����RTSP������, ʹ��ָ����<code>handler</code>, 
	 * �������ӳɹ������listener.operationCompleted();
	 * @param address
	 * @param handler
	 * @param listener
	 */
	public void connect(final SocketAddress address, final RtspActionHandler handler, final ConnectListener listener);
	
	/**
	 * �������ӵĳ�ʱʱ��
	 * @param timeout ��ʱʱ��
	 */
	public void setConnectTimeout(int timeout);
	
	/**
	 * �����¼�������
	 * @param listener
	 */
	public void setEventListener(RtspEventListener listener);
	
	/**
	 * �ر���������
	 */
	public void shutdown();
}
