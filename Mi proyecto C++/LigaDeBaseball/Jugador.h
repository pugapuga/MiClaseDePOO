#ifndef JUGADOR_H
#define JUGADOR_H

namespace MiTarea {
	namespace LigaDeBaseball {
		class Jugador {

		private:
			int nombre;
			MiTarea::LigaDeBaseball::Equipo elEquipo;

		public:
			Jugador();

			void getNombre();

			void setNombre(int nombre);
		};
	}
}

#endif
