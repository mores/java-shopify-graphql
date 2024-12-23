package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a merchant checkout for the given draft order.
 */
public class DraftOrderCreateMerchantCheckoutGraphQLQuery extends GraphQLQuery {
  public DraftOrderCreateMerchantCheckoutGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DraftOrderCreateMerchantCheckoutGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderCreateMerchantCheckout";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DraftOrderCreateMerchantCheckoutGraphQLQuery build() {
      return new DraftOrderCreateMerchantCheckoutGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * Specifies the Draft order's id that we create the checkout for.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
