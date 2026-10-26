package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountAutomaticBxgyInput;
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
 * that's automatically applied on a cart and at checkout.
 *   
 * > Note:
 * > To create code discounts, use the
 * [`discountCodeBxgyCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeBxgyCreate)
 * mutation.
 */
public class DiscountAutomaticBxgyCreateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBxgyCreateGraphQLQuery(DiscountAutomaticBxgyInput automaticBxgyDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (automaticBxgyDiscount != null || fieldsSet.contains("automaticBxgyDiscount")) {
        getInput().put("automaticBxgyDiscount", automaticBxgyDiscount);
    }
  }

  public DiscountAutomaticBxgyCreateGraphQLQuery(DiscountAutomaticBxgyInput automaticBxgyDiscount,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (automaticBxgyDiscount != null || fieldsSet.contains("automaticBxgyDiscount")) {
        getInput().put("automaticBxgyDiscount", automaticBxgyDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountAutomaticBxgyCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBxgyCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private DiscountAutomaticBxgyInput automaticBxgyDiscount;

    private String queryName;

    public DiscountAutomaticBxgyCreateGraphQLQuery build() {
      return new DiscountAutomaticBxgyCreateGraphQLQuery(automaticBxgyDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input data used to create the automatic BXGY discount.
     */
    public Builder automaticBxgyDiscount(DiscountAutomaticBxgyInput automaticBxgyDiscount) {
      this.automaticBxgyDiscount = automaticBxgyDiscount;
      this.fieldsSet.add("automaticBxgyDiscount");
      return this;
    }

    /**
     * The input data used to create the automatic BXGY discount.
     */
    public Builder automaticBxgyDiscountReference(String variableRef) {
      this.variableReferences.put("automaticBxgyDiscount", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DiscountAutomaticBxgyInput"))).build());
      this.fieldsSet.add("automaticBxgyDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
