package com.applicationtls.tools.data.repository;

import com.applicationtls.tools.data.local.database.tools.ToolsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DefaultToolsRepository_Factory implements Factory<DefaultToolsRepository> {
  private final Provider<ToolsDao> toolsDaoProvider;

  public DefaultToolsRepository_Factory(Provider<ToolsDao> toolsDaoProvider) {
    this.toolsDaoProvider = toolsDaoProvider;
  }

  @Override
  public DefaultToolsRepository get() {
    return newInstance(toolsDaoProvider.get());
  }

  public static DefaultToolsRepository_Factory create(Provider<ToolsDao> toolsDaoProvider) {
    return new DefaultToolsRepository_Factory(toolsDaoProvider);
  }

  public static DefaultToolsRepository newInstance(ToolsDao toolsDao) {
    return new DefaultToolsRepository(toolsDao);
  }
}
