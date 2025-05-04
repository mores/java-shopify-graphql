package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DraftOrderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a draft order.
 *   
 * If a checkout has been started for a draft order, any update to the draft will unlink the checkout. Checkouts
 * are created but not immediately completed when opening the merchant credit card modal in the admin, and when a
 * buyer opens the invoice URL. This is usually fine, but there is an edge case where a checkout is in progress
 * and the draft is updated before the checkout completes. This will not interfere with the checkout and order
 * creation, but if the link from draft to checkout is broken the draft will remain open even after the order is
 * created.
 */
public class DraftOrderUpdateGraphQLQuery extends GraphQLQuery {
  public DraftOrderUpdateGraphQLQuery(String id, DraftOrderInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public DraftOrderUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DraftOrderInput input;

    private String queryName;

    public DraftOrderUpdateGraphQLQuery build() {
      return new DraftOrderUpdateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the draft order to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The draft order properties to update.
     */
    public Builder input(DraftOrderInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
