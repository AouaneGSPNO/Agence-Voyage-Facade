public class AgenceVoyageFacade {
  private Hotel hotel;
  private Vol vol;
  private AutreDispositions dispositions;

  public void ConsulterAgenceVoyage() {
    this.hotel = new Hotel();
    this.vol = new Vol();
    this.dispositions = new AutreDispositions ();
  }

  public void planifierSejour() {
    System.out.println("\n Planification de séjour en cours...");
    hotel.réserver();
    vol.réserver();
    dispositions.rechercher();
    System.out.println("\n Votre séjour est  planifié avec succès!");
  }
}
