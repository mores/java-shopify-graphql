package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CartMetafieldsSetInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sets cart metafield values. Cart metafield values will be set regardless if they were previously created or not.
 *   
 * Allows a maximum of 25 cart metafields to be set at a time.
 */
public class CartMetafieldsSetGraphQLQuery extends GraphQLQuery {
  public CartMetafieldsSetGraphQLQuery(List<CartMetafieldsSetInput> metafields, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public CartMetafieldsSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartMetafieldsSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<CartMetafieldsSetInput> metafields;

    private String queryName;

    public CartMetafieldsSetGraphQLQuery build() {
      return new CartMetafieldsSetGraphQLQuery(metafields, queryName, fieldsSet);
               
    }

    /**
     * The list of Cart metafield values to set. Maximum of 25.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder metafields(List<CartMetafieldsSetInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
