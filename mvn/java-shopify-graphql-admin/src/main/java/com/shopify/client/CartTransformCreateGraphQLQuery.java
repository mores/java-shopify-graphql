package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Create a CartTransform function to the Shop.
 */
public class CartTransformCreateGraphQLQuery extends GraphQLQuery {
  public CartTransformCreateGraphQLQuery(String functionId, Boolean blockOnFailure,
      List<MetafieldInput> metafields, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (functionId != null || fieldsSet.contains("functionId")) {
        getInput().put("functionId", functionId);
    }if (blockOnFailure != null || fieldsSet.contains("blockOnFailure")) {
        getInput().put("blockOnFailure", blockOnFailure);
    }if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public CartTransformCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartTransformCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String functionId;

    private Boolean blockOnFailure;

    private List<MetafieldInput> metafields;

    private String queryName;

    public CartTransformCreateGraphQLQuery build() {
      return new CartTransformCreateGraphQLQuery(functionId, blockOnFailure, metafields, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the Function providing the cart transform.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      this.fieldsSet.add("functionId");
      return this;
    }

    /**
     * Whether a run failure should block cart and checkout operations.
     */
    public Builder blockOnFailure(Boolean blockOnFailure) {
      this.blockOnFailure = blockOnFailure;
      this.fieldsSet.add("blockOnFailure");
      return this;
    }

    /**
     * Additional metafields to associate to the cart transform.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
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
