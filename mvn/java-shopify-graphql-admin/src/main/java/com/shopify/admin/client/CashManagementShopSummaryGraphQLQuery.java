package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CurrencyCode;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Summary of cash management data across all locations with a POS Pro subscription for a shop, filtered by currency.
 */
public class CashManagementShopSummaryGraphQLQuery extends GraphQLQuery {
  public CashManagementShopSummaryGraphQLQuery(CurrencyCode currencyCode, LocalDate startDate,
      LocalDate endDate, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (currencyCode != null || fieldsSet.contains("currencyCode")) {
        getInput().put("currencyCode", currencyCode);
    }if (startDate != null || fieldsSet.contains("startDate")) {
        getInput().put("startDate", startDate);
    }if (endDate != null || fieldsSet.contains("endDate")) {
        getInput().put("endDate", endDate);
    }
  }

  public CashManagementShopSummaryGraphQLQuery(CurrencyCode currencyCode, LocalDate startDate,
      LocalDate endDate, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (currencyCode != null || fieldsSet.contains("currencyCode")) {
        getInput().put("currencyCode", currencyCode);
    }if (startDate != null || fieldsSet.contains("startDate")) {
        getInput().put("startDate", startDate);
    }if (endDate != null || fieldsSet.contains("endDate")) {
        getInput().put("endDate", endDate);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CashManagementShopSummaryGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "cashManagementShopSummary";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CurrencyCode currencyCode;

    private LocalDate startDate;

    private LocalDate endDate;

    private String queryName;

    public CashManagementShopSummaryGraphQLQuery build() {
      return new CashManagementShopSummaryGraphQLQuery(currencyCode, startDate, endDate, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The currency code to filter by.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      this.fieldsSet.add("currencyCode");
      return this;
    }

    /**
     * The currency code to filter by.
     */
    public Builder currencyCodeReference(String variableRef) {
      this.variableReferences.put("currencyCode", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CurrencyCode"))).build());
      this.fieldsSet.add("currencyCode");
      return this;
    }

    /**
     * The start date to summarize from.
     */
    public Builder startDate(LocalDate startDate) {
      this.startDate = startDate;
      this.fieldsSet.add("startDate");
      return this;
    }

    /**
     * The start date to summarize from.
     */
    public Builder startDateReference(String variableRef) {
      this.variableReferences.put("startDate", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Date"))).build());
      this.fieldsSet.add("startDate");
      return this;
    }

    /**
     * The end date to summarize to.
     */
    public Builder endDate(LocalDate endDate) {
      this.endDate = endDate;
      this.fieldsSet.add("endDate");
      return this;
    }

    /**
     * The end date to summarize to.
     */
    public Builder endDateReference(String variableRef) {
      this.variableReferences.put("endDate", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Date"))).build());
      this.fieldsSet.add("endDate");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
