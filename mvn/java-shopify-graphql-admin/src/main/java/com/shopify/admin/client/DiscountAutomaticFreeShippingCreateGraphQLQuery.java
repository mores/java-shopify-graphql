package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountAutomaticFreeShippingInput;
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
 * Creates automatic free shipping discounts that apply to qualifying orders
 * without requiring discount codes. These promotions automatically activate when
 * customers meet specified criteria, streamlining the checkout experience.
 *   
 * For example, a store might create an automatic free shipping discount for
 * orders over variable pricing to encourage larger purchases, or offer free
 * shipping to specific customer segments during promotional periods.
 *   
 * Use `DiscountAutomaticFreeShippingCreate` to:
 * - Set up code-free shipping promotions
 * - Create order value-based shipping incentives
 * - Target specific customer groups with shipping benefits
 * - Establish location-based shipping discounts
 *   
 * The mutation validates discount configuration and returns the created
 * automatic discount node along with any configuration errors that need resolution.
 *   
 * Learn more about [automatic discounts](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticNode).
 */
public class DiscountAutomaticFreeShippingCreateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticFreeShippingCreateGraphQLQuery(
      DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (freeShippingAutomaticDiscount != null || fieldsSet.contains("freeShippingAutomaticDiscount")) {
        getInput().put("freeShippingAutomaticDiscount", freeShippingAutomaticDiscount);
    }
  }

  public DiscountAutomaticFreeShippingCreateGraphQLQuery(
      DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (freeShippingAutomaticDiscount != null || fieldsSet.contains("freeShippingAutomaticDiscount")) {
        getInput().put("freeShippingAutomaticDiscount", freeShippingAutomaticDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountAutomaticFreeShippingCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticFreeShippingCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount;

    private String queryName;

    public DiscountAutomaticFreeShippingCreateGraphQLQuery build() {
      return new DiscountAutomaticFreeShippingCreateGraphQLQuery(freeShippingAutomaticDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input data used to create the automatic free shipping discount.
     */
    public Builder freeShippingAutomaticDiscount(
        DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount) {
      this.freeShippingAutomaticDiscount = freeShippingAutomaticDiscount;
      this.fieldsSet.add("freeShippingAutomaticDiscount");
      return this;
    }

    /**
     * The input data used to create the automatic free shipping discount.
     */
    public Builder freeShippingAutomaticDiscountReference(String variableRef) {
      this.variableReferences.put("freeShippingAutomaticDiscount", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DiscountAutomaticFreeShippingInput"))).build());
      this.fieldsSet.add("freeShippingAutomaticDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
