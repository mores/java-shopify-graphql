package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SellingPlanGroupInput;
import com.shopify.admin.types.SellingPlanGroupResourceInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a Selling Plan Group.
 */
public class SellingPlanGroupCreateGraphQLQuery extends GraphQLQuery {
  public SellingPlanGroupCreateGraphQLQuery(SellingPlanGroupInput input,
      SellingPlanGroupResourceInput resources, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (resources != null || fieldsSet.contains("resources")) {
        getInput().put("resources", resources);
    }
  }

  public SellingPlanGroupCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "sellingPlanGroupCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SellingPlanGroupInput input;

    private SellingPlanGroupResourceInput resources;

    private String queryName;

    public SellingPlanGroupCreateGraphQLQuery build() {
      return new SellingPlanGroupCreateGraphQLQuery(input, resources, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new Selling Plan Group.
     */
    public Builder input(SellingPlanGroupInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The resources this Selling Plan Group should be applied to.
     */
    public Builder resources(SellingPlanGroupResourceInput resources) {
      this.resources = resources;
      this.fieldsSet.add("resources");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
