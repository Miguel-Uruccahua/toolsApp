package com.applicationtls.tools.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/applicationtls/tools/data/repository/ReminderRepositoryImpl;", "Lcom/applicationtls/tools/data/repository/ReminderRepository;", "reminderDao", "Lcom/applicationtls/tools/data/local/database/reminder/ReminderDao;", "(Lcom/applicationtls/tools/data/local/database/reminder/ReminderDao;)V", "add", "", "reminder", "Lcom/applicationtls/tools/ui/reminder/domain/ReminderModel;", "(Lcom/applicationtls/tools/ui/reminder/domain/ReminderModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "getData", "Lkotlinx/coroutines/flow/Flow;", "", "update", "app_debug"})
public final class ReminderRepositoryImpl implements com.applicationtls.tools.data.repository.ReminderRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.applicationtls.tools.data.local.database.reminder.ReminderDao reminderDao = null;
    
    @javax.inject.Inject()
    public ReminderRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.data.local.database.reminder.ReminderDao reminderDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object add(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.applicationtls.tools.ui.reminder.domain.ReminderModel reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.applicationtls.tools.ui.reminder.domain.ReminderModel>> getData() {
        return null;
    }
}