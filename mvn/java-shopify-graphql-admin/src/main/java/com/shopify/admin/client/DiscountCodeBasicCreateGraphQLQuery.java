package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountCodeBasicInput;
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
 * Creates an [amount off discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
 * that's applied on a cart and at checkout when a customer enters a code. Amount
 * off discounts can be a percentage off or a fixed amount off.
 *   
 * > Note:
 * > To create discounts that are automatically applied on a cart and at
 * checkout, use the [`discountAutomaticBasicCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountAutomaticBasicCreate) mutation.
 */
public class DiscountCodeBasicCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBasicCreateGraphQLQuery(DiscountCodeBasicInput basicCodeDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (basicCodeDiscount != null || fieldsSet.contains("basicCodeDiscount")) {
        getInput().put("basicCodeDiscount", basicCodeDiscount);
    }
  }

  public DiscountCodeBasicCreateGraphQLQuery(DiscountCodeBasicInput basicCodeDiscount,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (basicCodeDiscount != null || fieldsSet.contains("basicCodeDiscount")) {
        getInput().put("basicCodeDiscount", basicCodeDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountCodeBasicCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBasicCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private DiscountCodeBasicInput basicCodeDiscount;

    private String queryName;

    public DiscountCodeBasicCreateGraphQLQuery build() {
      return new DiscountCodeBasicCreateGraphQLQuery(basicCodeDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input data used to create the discount code.
     */
    public Builder basicCodeDiscount(DiscountCodeBasicInput basicCodeDiscount) {
      this.basicCodeDiscount = basicCodeDiscount;
      this.fieldsSet.add("basicCodeDiscount");
      return this;
    }

    /**
     * The input data used to create the discount code.
     */
    public Builder basicCodeDiscountReference(String variableRef) {
      this.variableReferences.put("basicCodeDiscount", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DiscountCodeBasicInput"))).build());
      this.fieldsSet.add("basicCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
