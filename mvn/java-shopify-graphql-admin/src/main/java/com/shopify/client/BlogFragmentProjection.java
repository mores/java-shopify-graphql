package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class BlogFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public BlogFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Blog"));
  }

  public BlogFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> articles() {
     ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());
     getFields().put("articles", projection);
     return projection;
  }

  public ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> articles(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ArticleConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());    
    getFields().put("articles", projection);
    getInputArguments().computeIfAbsent("articles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("articles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("articles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("articles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("articles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("articles").add(reverseArg);
    return projection;
  }

  public CountProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> articlesCount() {
     CountProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("articlesCount", projection);
     return projection;
  }

  public CommentPolicyProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> commentPolicy() {
     CommentPolicyProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentPolicyProjection<>(this, getRoot());
     getFields().put("commentPolicy", projection);
     return projection;
  }

  public EventConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public BlogFeedProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> feed() {
     BlogFeedProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new BlogFeedProjection<>(this, getRoot());
     getFields().put("feed", projection);
     return projection;
  }

  public MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public TranslationProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<BlogFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public BlogFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public BlogFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Blog {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
