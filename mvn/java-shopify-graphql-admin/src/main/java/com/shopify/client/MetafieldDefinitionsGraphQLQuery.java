package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldDefinitionConstraintStatus;
import com.shopify.types.MetafieldDefinitionConstraintSubtypeIdentifier;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import com.shopify.types.MetafieldOwnerType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MetafieldDefinitionsGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionsGraphQLQuery(String key, String namespace,
      MetafieldOwnerType ownerType, MetafieldDefinitionPinnedStatus pinnedStatus,
      MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype,
      MetafieldDefinitionConstraintStatus constraintStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (key != null || fieldsSet.contains("key")) {
        getInput().put("key", key);
    }if (namespace != null || fieldsSet.contains("namespace")) {
        getInput().put("namespace", namespace);
    }if (ownerType != null || fieldsSet.contains("ownerType")) {
        getInput().put("ownerType", ownerType);
    }if (pinnedStatus != null || fieldsSet.contains("pinnedStatus")) {
        getInput().put("pinnedStatus", pinnedStatus);
    }if (constraintSubtype != null || fieldsSet.contains("constraintSubtype")) {
        getInput().put("constraintSubtype", constraintSubtype);
    }if (constraintStatus != null || fieldsSet.contains("constraintStatus")) {
        getInput().put("constraintStatus", constraintStatus);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public MetafieldDefinitionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String key;

    private String namespace;

    private MetafieldOwnerType ownerType;

    private MetafieldDefinitionPinnedStatus pinnedStatus;

    private MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype;

    private MetafieldDefinitionConstraintStatus constraintStatus;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private MetafieldDefinitionSortKeys sortKey;

    private String query;

    private String queryName;

    public MetafieldDefinitionsGraphQLQuery build() {
      return new MetafieldDefinitionsGraphQLQuery(key, namespace, ownerType, pinnedStatus, constraintSubtype, constraintStatus, first, after, last, before, reverse, sortKey, query, queryName, fieldsSet);
               
    }

    
    public Builder key(String key) {
      this.key = key;
      this.fieldsSet.add("key");
      return this;
    }

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      this.fieldsSet.add("namespace");
      return this;
    }

    
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      this.fieldsSet.add("ownerType");
      return this;
    }

    
    public Builder pinnedStatus(MetafieldDefinitionPinnedStatus pinnedStatus) {
      this.pinnedStatus = pinnedStatus;
      this.fieldsSet.add("pinnedStatus");
      return this;
    }

    
    public Builder constraintSubtype(
        MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype) {
      this.constraintSubtype = constraintSubtype;
      this.fieldsSet.add("constraintSubtype");
      return this;
    }

    
    public Builder constraintStatus(MetafieldDefinitionConstraintStatus constraintStatus) {
      this.constraintStatus = constraintStatus;
      this.fieldsSet.add("constraintStatus");
      return this;
    }

    
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    
    public Builder sortKey(MetafieldDefinitionSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
