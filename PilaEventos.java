public class PilaEventos {

    private EventoInspeccion[] pila;
    private int tope;

    public PilaEventos(int capacidad) {
        pila = new EventoInspeccion[capacidad];
        tope = -1;
    }

    public void push(EventoInspeccion e) throws PilaLlenaException {
        if (tope == pila.length - 1)
            throw new PilaLlenaException("Pila llena");
        pila[++tope] = e;
    }

    public EventoInspeccion pop() throws PilaVaciaException {
        if (isEmpty())
            throw new PilaVaciaException("Pila vacía");
        return pila[tope--];
    }

    public EventoInspeccion peek() throws PilaVaciaException {
        if (isEmpty())
            throw new PilaVaciaException("Pila vacía");
        return pila[tope];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public int size() {
        return tope + 1;
    }

    public void mostrarDesdeElTope() {
        for (int i = tope; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }
}