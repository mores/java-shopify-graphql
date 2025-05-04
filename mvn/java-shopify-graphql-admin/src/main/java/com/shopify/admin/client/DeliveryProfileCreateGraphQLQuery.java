package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryProfileInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a delivery profile.
 */
public class DeliveryProfileCreateGraphQLQuery extends GraphQLQuery {
  public DeliveryProfileCreateGraphQLQuery(DeliveryProfileInput profile, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (profile != null || fieldsSet.contains("profile")) {
        getInput().put("profile", profile);
    }
  }

  public DeliveryProfileCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryProfileCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliveryProfileInput profile;

    private String queryName;

    public DeliveryProfileCreateGraphQLQuery build() {
      return new DeliveryProfileCreateGraphQLQuery(profile, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for a delivery profile.
     */
    public Builder profile(DeliveryProfileInput profile) {
      this.profile = profile;
      this.fieldsSet.add("profile");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
