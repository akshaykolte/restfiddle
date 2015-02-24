/*
 * Copyright 2014 Ranjan Kumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.restfiddle.entity;

import java.util.List;

import javax.persistence.Lob;
import javax.persistence.Transient;

public class RfRequest extends NamedEntity {
    private static final long serialVersionUID = 1L;

    @Lob
    private byte[] apiUrl;

    @Transient
    private String apiUrlString;

    private String methodType;

    @Lob
    private byte[] apiBody;

    @Transient
    private String apiBodyString;

    private List<RfHeader> rfHeaders;

    private List<RfCookie> rfCookies;

    private List<UrlParam> urlParams;

    private List<FormParam> formParams;

    private String conversationId;

    private Assertion assertion;

    public String getMethodType() {
	return methodType;
    }

    public void setMethodType(String methodType) {
	this.methodType = methodType;
    }

    public List<RfHeader> getRfHeaders() {
	return rfHeaders;
    }

    public void setRfHeaders(List<RfHeader> rfHeaders) {
	this.rfHeaders = rfHeaders;
    }

    public List<RfCookie> getRfCookies() {
	return rfCookies;
    }

    public void setRfCookies(List<RfCookie> rfCookies) {
	this.rfCookies = rfCookies;
    }

    public byte[] getApiBody() {
	return apiBody;
    }

    public void setApiBody(byte[] apiBody) {
	this.apiBody = apiBody;
    }

    public String getApiBodyString() {
	if (apiBody == null) {
	    return "";
	}
	return new String(apiBody);
    }

    public void setApiBodyString(String apiBodyString) {
	this.apiBodyString = apiBodyString;
    }

    public List<UrlParam> getUrlParams() {
	return urlParams;
    }

    public void setUrlParams(List<UrlParam> urlParams) {
	this.urlParams = urlParams;
    }

    public List<FormParam> getFormParams() {
	return formParams;
    }

    public void setFormParams(List<FormParam> formParams) {
	this.formParams = formParams;
    }

    public byte[] getApiUrl() {
	return apiUrl;
    }

    public void setApiUrl(byte[] apiUrl) {
	this.apiUrl = apiUrl;
    }

    public String getApiUrlString() {
	if (apiUrl == null) {
	    return null;
	} else {
	    return new String(apiUrl);
	}
    }

    public void setApiUrlString(String apiUrlString) {
	this.apiUrlString = apiUrlString;
	if (apiUrlString != null) {
	    this.setApiUrl(apiUrlString.getBytes());
	} else {
	    this.setApiUrl(null);
	}
    }

    public Assertion getAssertion() {
	return assertion;
    }

    public void setAssertion(Assertion assertion) {
	this.assertion = assertion;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }
}
