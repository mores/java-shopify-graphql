package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Retrieves a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
 * by its discount code. The search is case-insensitive, enabling you to find
 * discounts regardless of how customers enter the code.
 *   
 * Returns a [`DiscountCodeNode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeNode) that contains the underlying discount details, which could be a basic [amount off discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount),
 * a ["Buy X Get Y" (BXGY) discount](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y),
 * a [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping),
 * or an [app-provided discount](https://help.shopify.com/manual/discounts/discount-types/discounts-with-apps).
 *   
 * Learn more about working with [Shopify's discount model](https://shopify.dev/docs/apps/build/discounts).
 */
public class CodeDiscountNodeByCodeGraphQLQuery extends GraphQLQuery {
  public CodeDiscountNodeByCodeGraphQLQuery(String code, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
  }

  public CodeDiscountNodeByCodeGraphQLQuery(String code, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CodeDiscountNodeByCodeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "codeDiscountNodeByCode";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String code;

    private String queryName;

    public CodeDiscountNodeByCodeGraphQLQuery build() {
      return new CodeDiscountNodeByCodeGraphQLQuery(code, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The case-insensitive code of the `DiscountCodeNode` to return.
     */
    public Builder code(String code) {
      this.code = code;
      this.fieldsSet.add("code");
      return this;
    }

    /**
     * The case-insensitive code of the `DiscountCodeNode` to return.
     */
    public Builder codeReference(String variableRef) {
      this.variableReferences.put("code", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("code");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
