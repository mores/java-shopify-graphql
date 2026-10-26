package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MenuItemCreateInput;
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
 * Creates a navigation
 * [`Menu`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Menu) for
 * the online store. Menus organize links that help customers navigate to [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection),
 * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * [pages](https://shopify.dev/docs/api/admin-graphql/latest/objects/Page),
 * [blogs](https://shopify.dev/docs/api/admin-graphql/latest/objects/Blog), and custom URLs.
 *   
 * Each menu requires a unique handle for identification and can contain multiple [`MenuItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MenuItem)
 * objects with nested sub-items up to three levels deep.
 */
public class MenuCreateGraphQLQuery extends GraphQLQuery {
  public MenuCreateGraphQLQuery(String title, String handle, List<MenuItemCreateInput> items,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
  }

  public MenuCreateGraphQLQuery(String title, String handle, List<MenuItemCreateInput> items,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MenuCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "menuCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String title;

    private String handle;

    private List<MenuItemCreateInput> items;

    private String queryName;

    public MenuCreateGraphQLQuery build() {
      return new MenuCreateGraphQLQuery(title, handle, items, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The menu's title.
     */
    public Builder title(String title) {
      this.title = title;
      this.fieldsSet.add("title");
      return this;
    }

    /**
     * The menu's title.
     */
    public Builder titleReference(String variableRef) {
      this.variableReferences.put("title", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("title");
      return this;
    }

    /**
     * The menu's handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The menu's handle.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * List of the menu's items.
     */
    public Builder items(List<MenuItemCreateInput> items) {
      this.items = items;
      this.fieldsSet.add("items");
      return this;
    }

    /**
     * List of the menu's items.
     */
    public Builder itemsReference(String variableRef) {
      this.variableReferences.put("items", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("MenuItemCreateInput"))))).build());
      this.fieldsSet.add("items");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
