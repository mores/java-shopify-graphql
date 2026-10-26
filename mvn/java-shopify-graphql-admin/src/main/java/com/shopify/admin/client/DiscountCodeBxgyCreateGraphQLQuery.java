package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountCodeBxgyInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a
 * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
 * that's applied on a cart and at checkout when a customer enters a code.
 *   
 * > Note:
 * > To create discounts that are automatically applied on a cart and at checkout, use the
 * [`discountAutomaticBxgyCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountAutomaticBxgyCreate)
 * mutation.
 */
public class DiscountCodeBxgyCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBxgyCreateGraphQLQuery(DiscountCodeBxgyInput bxgyCodeDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (bxgyCodeDiscount != null || fieldsSet.contains("bxgyCodeDiscount")) {
        getInput().put("bxgyCodeDiscount", bxgyCodeDiscount);
    }
  }

  public DiscountCodeBxgyCreateGraphQLQuery(DiscountCodeBxgyInput bxgyCodeDiscount,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (bxgyCodeDiscount != null || fieldsSet.contains("bxgyCodeDiscount")) {
        getInput().put("bxgyCodeDiscount", bxgyCodeDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountCodeBxgyCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBxgyCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private DiscountCodeBxgyInput bxgyCodeDiscount;

    private String queryName;

    public DiscountCodeBxgyCreateGraphQLQuery build() {
      return new DiscountCodeBxgyCreateGraphQLQuery(bxgyCodeDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input data used to create the BXGY code discount.
     */
    public Builder bxgyCodeDiscount(DiscountCodeBxgyInput bxgyCodeDiscount) {
      this.bxgyCodeDiscount = bxgyCodeDiscount;
      this.fieldsSet.add("bxgyCodeDiscount");
      return this;
    }

    /**
     * The input data used to create the BXGY code discount.
     */
    public Builder bxgyCodeDiscountReference(String variableRef) {
      this.variableReferences.put("bxgyCodeDiscount", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DiscountCodeBxgyInput"))).build());
      this.fieldsSet.add("bxgyCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
