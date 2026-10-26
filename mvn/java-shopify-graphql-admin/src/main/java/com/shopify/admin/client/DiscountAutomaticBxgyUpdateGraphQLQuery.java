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
 * Updates an existing
 * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
 * that's automatically applied on a cart and at checkout.
 *   
 * > Note:
 * > To update code discounts, use the
 * [`discountCodeBxgyUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeBxgyUpdate)
 * mutation instead.
 */
public class DiscountAutomaticBxgyUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBxgyUpdateGraphQLQuery(String id,
      DiscountAutomaticBxgyInput automaticBxgyDiscount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (automaticBxgyDiscount != null || fieldsSet.contains("automaticBxgyDiscount")) {
        getInput().put("automaticBxgyDiscount", automaticBxgyDiscount);
    }
  }

  public DiscountAutomaticBxgyUpdateGraphQLQuery(String id,
      DiscountAutomaticBxgyInput automaticBxgyDiscount, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (automaticBxgyDiscount != null || fieldsSet.contains("automaticBxgyDiscount")) {
        getInput().put("automaticBxgyDiscount", automaticBxgyDiscount);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountAutomaticBxgyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBxgyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private DiscountAutomaticBxgyInput automaticBxgyDiscount;

    private String queryName;

    public DiscountAutomaticBxgyUpdateGraphQLQuery build() {
      return new DiscountAutomaticBxgyUpdateGraphQLQuery(id, automaticBxgyDiscount, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the automatic BXGY discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the automatic BXGY discount to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the automatic BXGY discount.
     */
    public Builder automaticBxgyDiscount(DiscountAutomaticBxgyInput automaticBxgyDiscount) {
      this.automaticBxgyDiscount = automaticBxgyDiscount;
      this.fieldsSet.add("automaticBxgyDiscount");
      return this;
    }

    /**
     * The input data used to update the automatic BXGY discount.
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
