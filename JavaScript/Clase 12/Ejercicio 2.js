function createTaskManager() {
    let tasks = [];
    let nextId = 1;

    return {
        addTask: function(description) {
            tasks.push({ id: nextId++, description, completed: false });
        },

        completeTask: function(taskId) {
            const task = tasks.find(t => t.id === taskId);
            if (task) {
                task.completed = true;
            } else {
                console.log(`Tarea con ID ${taskId} no encontrada.`);
            }
        },

        listTasks: function() {
            tasks.forEach(task => {
                const status = task.completed ? "Completada" : "Pendiente";
                console.log(`[${task.id}] ${task.description} - ${status}`);
            });
        }
    };
}

const myTasks = createTaskManager();
myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");
myTasks.listTasks();
myTasks.completeTask(1);
myTasks.listTasks();
