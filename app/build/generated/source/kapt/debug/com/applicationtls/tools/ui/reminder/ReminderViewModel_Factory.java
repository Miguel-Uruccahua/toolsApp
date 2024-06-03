package com.applicationtls.tools.ui.reminder;

import com.applicationtls.tools.data.repository.ReminderRepository;
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
public final class ReminderViewModel_Factory implements Factory<ReminderViewModel> {
  private final Provider<ReminderRepository> reminderRepositoryProvider;

  public ReminderViewModel_Factory(Provider<ReminderRepository> reminderRepositoryProvider) {
    this.reminderRepositoryProvider = reminderRepositoryProvider;
  }

  @Override
  public ReminderViewModel get() {
    return newInstance(reminderRepositoryProvider.get());
  }

  public static ReminderViewModel_Factory create(
      Provider<ReminderRepository> reminderRepositoryProvider) {
    return new ReminderViewModel_Factory(reminderRepositoryProvider);
  }

  public static ReminderViewModel newInstance(ReminderRepository reminderRepository) {
    return new ReminderViewModel(reminderRepository);
  }
}
