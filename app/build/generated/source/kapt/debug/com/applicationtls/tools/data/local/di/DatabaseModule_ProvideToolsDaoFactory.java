package com.applicationtls.tools.data.local.di;

import com.applicationtls.tools.data.local.database.AppDatabase;
import com.applicationtls.tools.data.local.database.tools.ToolsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideToolsDaoFactory implements Factory<ToolsDao> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideToolsDaoFactory(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ToolsDao get() {
    return provideToolsDao(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideToolsDaoFactory create(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideToolsDaoFactory(module, appDatabaseProvider);
  }

  public static ToolsDao provideToolsDao(DatabaseModule instance, AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideToolsDao(appDatabase));
  }
}
