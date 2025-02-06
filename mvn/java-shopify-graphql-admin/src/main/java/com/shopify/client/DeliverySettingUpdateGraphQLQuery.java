package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DeliverySettingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Set the delivery settings for a shop.
 */
public class DeliverySettingUpdateGraphQLQuery extends GraphQLQuery {
  public DeliverySettingUpdateGraphQLQuery(DeliverySettingInput setting, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (setting != null || fieldsSet.contains("setting")) {
        getInput().put("setting", setting);
    }
  }

  public DeliverySettingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliverySettingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliverySettingInput setting;

    private String queryName;

    public DeliverySettingUpdateGraphQLQuery build() {
      return new DeliverySettingUpdateGraphQLQuery(setting, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for the delivery shop level settings.
     */
    public Builder setting(DeliverySettingInput setting) {
      this.setting = setting;
      this.fieldsSet.add("setting");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
