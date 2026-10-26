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
 * Removes tags from multiple draft orders.
 */
public class DraftOrderBulkRemoveTagsGraphQLQuery extends GraphQLQuery {
  public DraftOrderBulkRemoveTagsGraphQLQuery(String search, String savedSearchId, List<String> ids,
      List<String> tags, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }if (tags != null || fieldsSet.contains("tags")) {
        getInput().put("tags", tags);
    }
  }

  public DraftOrderBulkRemoveTagsGraphQLQuery(String search, String savedSearchId, List<String> ids,
      List<String> tags, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }if (tags != null || fieldsSet.contains("tags")) {
        getInput().put("tags", tags);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DraftOrderBulkRemoveTagsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderBulkRemoveTags";
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

    private List<String> tags;

    private String queryName;

    public DraftOrderBulkRemoveTagsGraphQLQuery build() {
      return new DraftOrderBulkRemoveTagsGraphQLQuery(search, savedSearchId, ids, tags, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The conditions for filtering draft orders on.
     * See the detailed [search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The conditions for filtering draft orders on.
     * See the detailed [search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder searchReference(String variableRef) {
      this.variableReferences.put("search", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of the draft order saved search for filtering draft orders on.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The ID of the draft order saved search for filtering draft orders on.
     */
    public Builder savedSearchIdReference(String variableRef) {
      this.variableReferences.put("savedSearchId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the draft orders to remove tags from.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The IDs of the draft orders to remove tags from.
     */
    public Builder idsReference(String variableRef) {
      this.variableReferences.put("ids", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * List of tags to be removed.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      this.fieldsSet.add("tags");
      return this;
    }

    /**
     * List of tags to be removed.
     */
    public Builder tagsReference(String variableRef) {
      this.variableReferences.put("tags", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))))).build());
      this.fieldsSet.add("tags");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
