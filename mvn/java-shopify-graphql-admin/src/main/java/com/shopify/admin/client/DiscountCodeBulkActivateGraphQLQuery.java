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
 * Activates multiple [code discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
 * asynchronously using one of the following:
 * - A search query
 * - A saved search ID
 * - A list of discount code IDs
 *   
 * For example, you can activate discounts for all codes that match a search
 * criteria, or activate a predefined set of discount codes.
 */
public class DiscountCodeBulkActivateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBulkActivateGraphQLQuery(String search, String savedSearchId, List<String> ids,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public DiscountCodeBulkActivateGraphQLQuery(String search, String savedSearchId, List<String> ids,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DiscountCodeBulkActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBulkActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String search;

    private String savedSearchId;

    private List<String> ids;

    private String queryName;

    public DiscountCodeBulkActivateGraphQLQuery build() {
      return new DiscountCodeBulkActivateGraphQLQuery(search, savedSearchId, ids, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The search query for filtering discounts.
     * <br><br>
     * For more information on the list of supported fields and search syntax, refer to the [`codeDiscountNodes`](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#query-arguments) query.
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The search query for filtering discounts.
     * <br><br>
     * For more information on the list of supported fields and search syntax, refer to the [`codeDiscountNodes`](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#query-arguments) query.
     */
    public Builder searchReference(String variableRef) {
      this.variableReferences.put("search", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of the saved search for filtering discounts to activate. Saved
     * searches represent [customer
     * segments](https://help.shopify.com/manual/customers/customer-segments) that
     * merchants have built in the Shopify admin.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The ID of the saved search for filtering discounts to activate. Saved
     * searches represent [customer
     * segments](https://help.shopify.com/manual/customers/customer-segments) that
     * merchants have built in the Shopify admin.
     */
    public Builder savedSearchIdReference(String variableRef) {
      this.variableReferences.put("savedSearchId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the discounts to activate.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The IDs of the discounts to activate.
     */
    public Builder idsReference(String variableRef) {
      this.variableReferences.put("ids", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
