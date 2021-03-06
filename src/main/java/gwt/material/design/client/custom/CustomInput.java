package gwt.material.design.client.custom;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
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
 * #L%
 */

import com.google.gwt.dom.client.Document;

public class CustomInput  extends ComplexWidget {
	
	private String type="";
	private String placeholder="";
	private boolean required;
	
	public CustomInput() {
		setElement(Document.get().createElement("input"));
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		this.getElement().setAttribute("type", type);
		
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
		this.getElement().setAttribute("required", String.valueOf(required));
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
		this.getElement().setAttribute("placeholder", placeholder);
	}

}