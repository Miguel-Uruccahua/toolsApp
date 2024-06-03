package com.applicationtls.tools.data.local.di;

import com.applicationtls.tools.data.local.database.AppDatabase;
import com.applicationtls.tools.data.local.database.reminder.ReminderDao;
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
public final class DatabaseModule_ProvideReminderDaoFactory implements Factory<ReminderDao> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideReminderDaoFactory(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ReminderDao get() {
    return provideReminderDao(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideReminderDaoFactory create(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideReminderDaoFactory(module, appDatabaseProvider);
  }

  public static ReminderDao provideReminderDao(DatabaseModule instance, AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideReminderDao(appDatabase));
  }
}
