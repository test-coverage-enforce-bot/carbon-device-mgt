/**
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: 0.10.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.carbon.apimgt.integration.client.store.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * Tier
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-24T00:03:54.991+05:30")
public class Tier   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * Gets or Sets tierLevel
   */
  public enum TierLevelEnum {
    API("api"),
    
    APPLICATION("application");

    private String value;

    TierLevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TierLevelEnum fromValue(String text) {
      for (TierLevelEnum b : TierLevelEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("tierLevel")
  private TierLevelEnum tierLevel = null;

  @JsonProperty("attributes")
  private Map<String, String> attributes = new HashMap<String, String>();

  @JsonProperty("requestCount")
  private Long requestCount = null;

  @JsonProperty("unitTime")
  private Long unitTime = null;

  /**
   * This attribute declares whether this tier is available under commercial or free 
   */
  public enum TierPlanEnum {
    FREE("FREE"),
    
    COMMERCIAL("COMMERCIAL");

    private String value;

    TierPlanEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TierPlanEnum fromValue(String text) {
      for (TierPlanEnum b : TierPlanEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("tierPlan")
  private TierPlanEnum tierPlan = null;

  @JsonProperty("stopOnQuotaReach")
  private Boolean stopOnQuotaReach = null;

  public Tier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Platinum", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tier description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Allows 50 request(s) per minute.", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tier tierLevel(TierLevelEnum tierLevel) {
    this.tierLevel = tierLevel;
    return this;
  }

   /**
   * Get tierLevel
   * @return tierLevel
  **/
  @ApiModelProperty(example = "api", value = "")
  public TierLevelEnum getTierLevel() {
    return tierLevel;
  }

  public void setTierLevel(TierLevelEnum tierLevel) {
    this.tierLevel = tierLevel;
  }

  public Tier attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Tier putAttributesItem(String key, String attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Custom attributes added to the tier policy 
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "Custom attributes added to the tier policy ")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public Tier requestCount(Long requestCount) {
    this.requestCount = requestCount;
    return this;
  }

   /**
   * Maximum number of requests which can be sent within a provided unit time 
   * @return requestCount
  **/
  @ApiModelProperty(example = "50", required = true, value = "Maximum number of requests which can be sent within a provided unit time ")
  public Long getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Long requestCount) {
    this.requestCount = requestCount;
  }

  public Tier unitTime(Long unitTime) {
    this.unitTime = unitTime;
    return this;
  }

   /**
   * Get unitTime
   * @return unitTime
  **/
  @ApiModelProperty(example = "60000", required = true, value = "")
  public Long getUnitTime() {
    return unitTime;
  }

  public void setUnitTime(Long unitTime) {
    this.unitTime = unitTime;
  }

  public Tier tierPlan(TierPlanEnum tierPlan) {
    this.tierPlan = tierPlan;
    return this;
  }

   /**
   * This attribute declares whether this tier is available under commercial or free 
   * @return tierPlan
  **/
  @ApiModelProperty(example = "FREE", required = true, value = "This attribute declares whether this tier is available under commercial or free ")
  public TierPlanEnum getTierPlan() {
    return tierPlan;
  }

  public void setTierPlan(TierPlanEnum tierPlan) {
    this.tierPlan = tierPlan;
  }

  public Tier stopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
    return this;
  }

   /**
   * If this attribute is set to false, you are capabale of sending requests even if the request count exceeded within a unit time 
   * @return stopOnQuotaReach
  **/
  @ApiModelProperty(example = "true", required = true, value = "If this attribute is set to false, you are capabale of sending requests even if the request count exceeded within a unit time ")
  public Boolean getStopOnQuotaReach() {
    return stopOnQuotaReach;
  }

  public void setStopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tier tier = (Tier) o;
    return Objects.equals(this.name, tier.name) &&
        Objects.equals(this.description, tier.description) &&
        Objects.equals(this.tierLevel, tier.tierLevel) &&
        Objects.equals(this.attributes, tier.attributes) &&
        Objects.equals(this.requestCount, tier.requestCount) &&
        Objects.equals(this.unitTime, tier.unitTime) &&
        Objects.equals(this.tierPlan, tier.tierPlan) &&
        Objects.equals(this.stopOnQuotaReach, tier.stopOnQuotaReach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, tierLevel, attributes, requestCount, unitTime, tierPlan, stopOnQuotaReach);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tier {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tierLevel: ").append(toIndentedString(tierLevel)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    unitTime: ").append(toIndentedString(unitTime)).append("\n");
    sb.append("    tierPlan: ").append(toIndentedString(tierPlan)).append("\n");
    sb.append("    stopOnQuotaReach: ").append(toIndentedString(stopOnQuotaReach)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
