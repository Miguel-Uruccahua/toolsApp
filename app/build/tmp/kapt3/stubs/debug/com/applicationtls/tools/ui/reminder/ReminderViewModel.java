package com.applicationtls.tools.ui.reminder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/applicationtls/tools/ui/reminder/ReminderViewModel;", "Landroidx/lifecycle/ViewModel;", "reminderRepository", "Lcom/applicationtls/tools/data/repository/ReminderRepository;", "(Lcom/applicationtls/tools/data/repository/ReminderRepository;)V", "_data", "Landroidx/lifecycle/MutableLiveData;", "", "data", "Landroidx/lifecycle/LiveData;", "getData", "()Landroidx/lifecycle/LiveData;", "setData", "(Landroidx/lifecycle/LiveData;)V", "listState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/applicationtls/tools/ui/reminder/ReminderUiState;", "getListState", "()Lkotlinx/coroutines/flow/StateFlow;", "addReminder", "", "deleteReminder", "reminderModel", "Lcom/applicationtls/tools/ui/reminder/domain/ReminderModel;", "onDataChange", "id", "updateReminder", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ReminderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.applicationtls.tools.data.repository.ReminderRepository reminderRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _data = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> data;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.applicationtls.tools.ui.reminder.ReminderUiState> listState = null;
    
    @javax.inject.Inject()
    public ReminderViewModel(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.data.repository.ReminderRepository reminderRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    public final void onDataChange(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void addReminder() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.applicationtls.tools.ui.reminder.ReminderUiState> getListState() {
        return null;
    }
    
    public final void deleteReminder(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminderModel) {
    }
    
    public final void updateReminder(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminderModel) {
    }
}