package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class BlogProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogProjectionRoot() {
    super(null, null, java.util.Optional.of("Blog"));
  }

  public BlogProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> articles(
      ) {
    ArticleConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new ArticleConnectionProjection<>(this, this);    
    getFields().put("articles", projection);
    return projection;
  }

  public ArticleConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> articles(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ArticleConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new ArticleConnectionProjection<>(this, this);    
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

  public CountProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> articlesCount(
      ) {
    CountProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("articlesCount", projection);
    return projection;
  }

  public CommentPolicyProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> commentPolicy(
      ) {
    CommentPolicyProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new CommentPolicyProjection<>(this, this);    
    getFields().put("commentPolicy", projection);
    return projection;
  }

  public EventConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public BlogFeedProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> feed(
      ) {
    BlogFeedProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new BlogFeedProjection<>(this, this);    
    getFields().put("feed", projection);
    return projection;
  }

  public MetafieldProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public TranslationProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<BlogProjectionRoot<PARENT, ROOT>, BlogProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public BlogProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public BlogProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public BlogProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BlogProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public BlogProjectionRoot<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public BlogProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public BlogProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
