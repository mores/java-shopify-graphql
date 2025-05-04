package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ShopPolicyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a shop policy.
 */
public class ShopPolicyUpdateGraphQLQuery extends GraphQLQuery {
  public ShopPolicyUpdateGraphQLQuery(ShopPolicyInput shopPolicy, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (shopPolicy != null || fieldsSet.contains("shopPolicy")) {
        getInput().put("shopPolicy", shopPolicy);
    }
  }

  public ShopPolicyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopPolicyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ShopPolicyInput shopPolicy;

    private String queryName;

    public ShopPolicyUpdateGraphQLQuery build() {
      return new ShopPolicyUpdateGraphQLQuery(shopPolicy, queryName, fieldsSet);
               
    }

    /**
     * The properties to use when updating the shop policy.
     */
    public Builder shopPolicy(ShopPolicyInput shopPolicy) {
      this.shopPolicy = shopPolicy;
      this.fieldsSet.add("shopPolicy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
